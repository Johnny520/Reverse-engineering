package com.android.dx.rop.annotation;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.MutabilityControl;
import com.android.dx.util.ToHuman;
import io.ktor.util.C4210;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Annotation extends MutabilityControl implements Comparable<Annotation>, ToHuman {
    private final TreeMap<CstString, NameValuePair> elements;
    private final CstType type;
    private final AnnotationVisibility visibility;

    public Annotation(CstType cstType, AnnotationVisibility annotationVisibility) {
        if (cstType == null) {
            C2632.m5298("type == null");
            throw null;
        }
        if (annotationVisibility == null) {
            C2632.m5298("visibility == null");
            throw null;
        }
        this.type = cstType;
        this.visibility = annotationVisibility;
        this.elements = new TreeMap<>();
    }

    public void add(NameValuePair nameValuePair) {
        throwIfImmutable();
        if (nameValuePair == null) {
            C2632.m5298("pair == null");
            return;
        }
        CstString name = nameValuePair.getName();
        if (this.elements.get(name) == null) {
            this.elements.put(name, nameValuePair);
        } else {
            C4210.m8614(name, "name already added: ");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Annotation annotation) {
        int iCompareTo = this.type.compareTo((Constant) annotation.type);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.visibility.compareTo(annotation.visibility);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator<NameValuePair> it = this.elements.values().iterator();
        Iterator<NameValuePair> it2 = annotation.elements.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = it.next().compareTo(it2.next());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Annotation)) {
            return false;
        }
        Annotation annotation = (Annotation) obj;
        if (this.type.equals(annotation.type) && this.visibility == annotation.visibility) {
            return this.elements.equals(annotation.elements);
        }
        return false;
    }

    public Collection<NameValuePair> getNameValuePairs() {
        return Collections.unmodifiableCollection(this.elements.values());
    }

    public CstType getType() {
        return this.type;
    }

    public AnnotationVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return this.visibility.hashCode() + ((this.elements.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public void put(NameValuePair nameValuePair) {
        throwIfImmutable();
        if (nameValuePair != null) {
            this.elements.put(nameValuePair.getName(), nameValuePair);
        } else {
            C2632.m5298("pair == null");
        }
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.visibility.toHuman());
        sb.append("-annotation ");
        sb.append(this.type.toHuman());
        sb.append(" {");
        boolean z = true;
        for (NameValuePair nameValuePair : this.elements.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(nameValuePair.getName().toHuman());
            sb.append(": ");
            sb.append(nameValuePair.getValue().toHuman());
        }
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        return toHuman();
    }
}
