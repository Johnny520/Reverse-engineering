package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1051e;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1050d {

    /* JADX INFO: renamed from: a */
    public SparseArray<a> f4255a;

    /* JADX INFO: renamed from: b */
    public SparseArray<C1051e> f4256b;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f4257a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<b> f4258b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public final int f4259c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f4259c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1046R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.State_android_id) {
                    this.f4257a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4257a);
                } else if (index == C1046R.styleable.State_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4259c);
                    this.f4259c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new C1051e().m2427b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final float f4260a;

        /* JADX INFO: renamed from: b */
        public final float f4261b;

        /* JADX INFO: renamed from: c */
        public final float f4262c;

        /* JADX INFO: renamed from: d */
        public final float f4263d;

        /* JADX INFO: renamed from: e */
        public final int f4264e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f4260a = Float.NaN;
            this.f4261b = Float.NaN;
            this.f4262c = Float.NaN;
            this.f4263d = Float.NaN;
            this.f4264e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1046R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.Variant_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4264e);
                    this.f4264e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new C1051e().m2427b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == C1046R.styleable.Variant_region_heightLessThan) {
                    this.f4263d = typedArrayObtainStyledAttributes.getDimension(index, this.f4263d);
                } else if (index == C1046R.styleable.Variant_region_heightMoreThan) {
                    this.f4261b = typedArrayObtainStyledAttributes.getDimension(index, this.f4261b);
                } else if (index == C1046R.styleable.Variant_region_widthLessThan) {
                    this.f4262c = typedArrayObtainStyledAttributes.getDimension(index, this.f4262c);
                } else if (index == C1046R.styleable.Variant_region_widthMoreThan) {
                    this.f4260a = typedArrayObtainStyledAttributes.getDimension(index, this.f4260a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2422a(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C1051e.a aVarM2424d;
        C1051e c1051e = new C1051e();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    aVarM2424d = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        byte b2 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    b2 = name.equals("Layout") ? (byte) 5 : (byte) -1;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        b2 = 6;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        b2 = 4;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        b2 = 2;
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        b2 = 7;
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        b2 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    aVarM2424d = C1051e.m2424d(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 1:
                                    aVarM2424d = C1051e.m2424d(context, Xml.asAttributeSet(xmlResourceParser));
                                    aVarM2424d.f4273d.f4303a = true;
                                    break;
                                case 2:
                                    aVarM2424d = C1051e.m2424d(context, Xml.asAttributeSet(xmlResourceParser));
                                    aVarM2424d.f4273d.f4308c0 = 1;
                                    break;
                                case 3:
                                    if (aVarM2424d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarM2424d.f4271b.m2434a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 4:
                                    if (aVarM2424d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarM2424d.f4274e.m2435a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 5:
                                    if (aVarM2424d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarM2424d.f4273d.m2432a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 6:
                                    if (aVarM2424d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarM2424d.f4272c.m2433a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 7:
                                    if (aVarM2424d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1048b.m2415a(context, xmlResourceParser, aVarM2424d.f4275f);
                                    break;
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                this.f4256b.put(identifier, c1051e);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c1051e.f4269c.put(Integer.valueOf(aVarM2424d.f4270a), aVarM2424d);
                                aVarM2424d = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                this.f4256b.put(identifier, c1051e);
                return;
            }
        }
    }
}
