package cz.cvut.fel.omo.inspection.securityAndValidation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import cz.cvut.fel.omo.inspection.metamodel.AfAnnotation;
import cz.cvut.fel.omo.inspection.metamodel.MetaModel;

import cz.cvut.fel.omo.inspection.AFContext;

public class PasswordChecker {

	public static Boolean validate(AFContext afContext, metamodel.Field field) {

		Iterator annotationIter = field.annotation.keySet().iterator();
		while (annotationIter.hasNext()) {
			String annotationKey = (String) annotationIter.next();
			AfAnnotation annotation = (AfAnnotation) field.annotation
					.get(annotationKey);
			if (annotation.name.equals("Password")) {
				return true;
			}
		}
		return false;

	}

	public static Boolean validate(AFContext afContext, MetaModel metamodel) {
		Boolean annFlag = false;

		Iterator annotationIter = metamodel.annotation.keySet().iterator();
		while (annotationIter.hasNext()) {
			String annotationKey = (String) annotationIter.next();
			AfAnnotation annotation = (AfAnnotation) metamodel.annotation
					.get(annotationKey);
			if (annotation.name.equals("Password")) {
				return true;
			}
		}
		return false;

	}

}