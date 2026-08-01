package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p266.C8997;
import p266.InterfaceC8990;
import p266.InterfaceC8994;
import p266.InterfaceC8996;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigList extends AbstractC4675 implements InterfaceC8994, InterfaceC4693, Serializable {
    private static final long serialVersionUID = 2;
    private final boolean resolved;
    private final List<AbstractC4675> value;

    public SimpleConfigList(InterfaceC8990 interfaceC8990, List<AbstractC4675> list, ResolveStatus resolveStatus) {
        super(interfaceC8990);
        this.value = list;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        if (resolveStatus == ResolveStatus.fromValues(list)) {
            return;
        }
        C3775.m6955(this, "SimpleConfigList created with wrong resolve status: ");
        throw null;
    }

    private SimpleConfigList modify(AbstractC4676 abstractC4676, ResolveStatus resolveStatus) {
        try {
            return modifyMayThrow(abstractC4676, resolveStatus);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigList modifyMayThrow(InterfaceC4677 interfaceC4677, ResolveStatus resolveStatus) {
        ArrayList arrayList = null;
        int i = 0;
        for (AbstractC4675 abstractC4675 : this.value) {
            AbstractC4675 abstractC4675Mo860 = interfaceC4677.mo860(abstractC4675, null);
            if (arrayList == null && abstractC4675Mo860 != abstractC4675) {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(this.value.get(i2));
                }
            }
            if (arrayList != null && abstractC4675Mo860 != null) {
                arrayList.add(abstractC4675Mo860);
            }
            i++;
        }
        return arrayList != null ? resolveStatus != null ? new SimpleConfigList(origin(), arrayList, resolveStatus) : new SimpleConfigList(origin(), arrayList) : this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException(AbstractC0900.m718("ConfigList is immutable, you can't call List.'", str, "'"));
    }

    private static ListIterator<InterfaceC8996> wrapListIterator(ListIterator<AbstractC4675> listIterator) {
        return new C4661(listIterator);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC8996> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean canEqual(Object obj) {
        return obj instanceof SimpleConfigList;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw weAreImmutable("clear");
    }

    public final SimpleConfigList concatenate(SimpleConfigList simpleConfigList) {
        C4670 c4670M8766 = C4670.m8766(origin(), simpleConfigList.origin());
        ArrayList arrayList = new ArrayList(simpleConfigList.value.size() + this.value.size());
        arrayList.addAll(this.value);
        arrayList.addAll(simpleConfigList.value);
        return new SimpleConfigList(c4670M8766, arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.value.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.value.containsAll(collection);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean equals(Object obj) {
        List<AbstractC4675> list;
        List<AbstractC4675> list2;
        return (obj instanceof SimpleConfigList) && canEqual(obj) && ((list = this.value) == (list2 = ((SimpleConfigList) obj).value) || list.equals(list2));
    }

    @Override // java.util.List
    public AbstractC4675 get(int i) {
        return this.value.get(i);
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public boolean hasDescendant(AbstractC4675 abstractC4675) {
        return AbstractC4675.hasDescendantInList(this.value, abstractC4675);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.value.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.value.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<InterfaceC8996> iterator() {
        return new C4662(this.value.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.value.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8996> listIterator() {
        return wrapListIterator(this.value.listIterator());
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public SimpleConfigList newCopy(InterfaceC8990 interfaceC8990) {
        return new SimpleConfigList(interfaceC8990, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public SimpleConfigList relativized(C4690 c4690) {
        return modify(new C4663(c4690), resolveStatus());
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw weAreImmutable("removeAll");
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        if (this.value.isEmpty()) {
            sb.append("[]");
            return;
        }
        sb.append("[");
        boolean z2 = c8997.f22846;
        if (z2) {
            sb.append('\n');
        }
        for (AbstractC4675 abstractC4675 : this.value) {
            if (c8997.f22848) {
                for (String str : abstractC4675.origin().m8769().split("\n")) {
                    AbstractC4675.indent(sb, i + 1, c8997);
                    sb.append('#');
                    if (!str.isEmpty()) {
                        sb.append(' ');
                    }
                    sb.append(str);
                    sb.append("\n");
                }
            }
            if (c8997.f22847) {
                List list = abstractC4675.origin().f12405;
                for (String str2 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                    AbstractC4675.indent(sb, i + 1, c8997);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            int i2 = i + 1;
            AbstractC4675.indent(sb, i2, c8997);
            abstractC4675.render(sb, i2, z, c8997);
            sb.append(",");
            if (z2) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (z2) {
            sb.setLength(sb.length() - 1);
            sb.append('\n');
            AbstractC4675.indent(sb, i, c8997);
        }
        sb.append("]");
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public SimpleConfigList replaceChild(AbstractC4675 abstractC4675, AbstractC4675 abstractC46752) {
        List<AbstractC4675> listReplaceChildInList = AbstractC4675.replaceChildInList(this.value, abstractC4675, abstractC46752);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new SimpleConfigList(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public C4684 resolveSubstitutions(C4679 c4679, C4681 c4681) throws AbstractConfigValue$NotPossibleToResolve {
        if (this.resolved) {
            return new C4684(c4679, this);
        }
        if (c4679.f12415 != null) {
            return new C4684(c4679, this);
        }
        try {
            C0923 c0923 = new C0923(c4679, 21, c4681.m8787(this));
            c4679.f12416.getClass();
            return new C4684((C4679) c0923.f572, modifyMayThrow(c0923, ResolveStatus.RESOLVED));
        } catch (AbstractConfigValue$NotPossibleToResolve e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e3);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw weAreImmutable("retainAll");
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.value.size();
    }

    @Override // java.util.List
    public List<InterfaceC8996> subList(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC4675> it = this.value.subList(i, i2).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.value.toArray();
    }

    @Override // p266.InterfaceC8996
    public List<Object> unwrapped() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC4675> it = this.value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().unwrapped());
        }
        return arrayList;
    }

    @Override // p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.LIST;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withOrigin */
    public SimpleConfigList mo8780withOrigin(InterfaceC8990 interfaceC8990) {
        return (SimpleConfigList) super.mo8780withOrigin(interfaceC8990);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC8996> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // java.util.List
    public InterfaceC8996 set(int i, InterfaceC8996 interfaceC8996) {
        throw weAreImmutable("set");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.value.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(InterfaceC8996 interfaceC8996) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public InterfaceC8996 remove(int i) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List
    public void add(int i, InterfaceC8996 interfaceC8996) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8996> listIterator(int i) {
        return wrapListIterator(this.value.listIterator(i));
    }

    public SimpleConfigList(InterfaceC8990 interfaceC8990, List<AbstractC4675> list) {
        this(interfaceC8990, list, ResolveStatus.fromValues(list));
    }
}
