package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationVisibilityType;
import org.luckypray.dexkit.result.AnnotationElementData;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4415Companion = null;
    private final InterfaceC0136b dexClass$delegate;
    private final List<AnnotationElementData> elements;
    private final String typeDescriptor;
    private final int typeId;
    private final AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final AnnotationData from(DexKitBridge r10, AnnotationMeta r11) {
            AbstractC0307g.m703e(r10, "bridge");
            AbstractC0307g.m703e(r11, "annotationMeta");
            int r3 = r11.m2688getDexIdpVg5ArA();
            int r4 = r11.m2689getTypeIdpVg5ArA();
            String r5 = r11.getTypeDescriptor();
            AbstractC0307g.m700b(r5);
            AnnotationVisibilityType r6 = AnnotationVisibilityType.Companion.from(r11.getVisibility());
            ArrayList r7 = new ArrayList();
            int r02 = r11.getElementsLength();
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L6;
            AnnotationElementData.Companion r2 = AnnotationElementData.f4416Companion;
            AnnotationElementMeta r8 = r11.elements(r1);
            AbstractC0307g.m700b(r8);
            r7.add(r2.from(r10, r8));
            r1 = r1 + 1;
            goto L3
        L6:
            return new AnnotationData(r10, r3, r4, r5, r6, r7, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4415Companion = new Companion(null);
    }

    public /* synthetic */ AnnotationData(DexKitBridge r1, int r2, int r3, String r4, AnnotationVisibilityType r5, List r6, AbstractC0304d r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private final DexClass getDexClass() {
        return (DexClass) ((C0142h) this.dexClass$delegate).m466a();
    }

    public final List<AnnotationElementData> getElements() {
        return this.elements;
    }

    public final String getTypeDescriptor() {
        return this.typeDescriptor;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getTypeName() {
        return getDexClass().getTypeName();
    }

    public final AnnotationVisibilityType getVisibility() {
        return this.visibility;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("@" + DexSignUtil.getTypeName(this.typeDescriptor));
        r02.append("(");
        Iterator<T> r1 = this.elements.iterator();
        int r2 = 0;
    L4:
        if (r1.hasNext() == false) goto L13;
        Object r3 = r1.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L11;
        AnnotationElementData r32 = (AnnotationElementData) r3;
        if (r2 == 0) goto L10;
        r02.append(", ");
    L10:
        r02.append(r32);
        r2 = r4;
        goto L4
    L11:
        AbstractC0182m.m558j0();
        throw null;
    L13:
        r02.append(")");
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }

    private AnnotationData(DexKitBridge r7, int r8, int r9, String r10, AnnotationVisibilityType r11, List<AnnotationElementData> r12) {
        super(r7, 0, 0, 6, null);
        this.typeId = r9;
        this.typeDescriptor = r10;
        this.visibility = r11;
        this.elements = r12;
        this.dexClass$delegate = AbstractC0040p.m81E(new AnnotationData$dexClass$2(this));
    }
}
