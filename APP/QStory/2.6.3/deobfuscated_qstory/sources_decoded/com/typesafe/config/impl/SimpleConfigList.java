package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p250.C8168;
import p250.InterfaceC8161;
import p250.InterfaceC8165;
import p250.InterfaceC8167;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigList extends AbstractC3843 implements InterfaceC8165, InterfaceC3861, Serializable {
    private static final long serialVersionUID = 2;
    private final boolean resolved;
    private final List<AbstractC3843> value;

    public SimpleConfigList(InterfaceC8161 interfaceC8161, List<AbstractC3843> list, ResolveStatus resolveStatus) {
        super(interfaceC8161);
        this.value = list;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        if (resolveStatus == ResolveStatus.fromValues(list)) {
            return;
        }
        C2942.m6395(this, "SimpleConfigList created with wrong resolve status: ");
        throw null;
    }

    private SimpleConfigList modify(AbstractC3844 abstractC3844, ResolveStatus resolveStatus) {
        try {
            return modifyMayThrow(abstractC3844, resolveStatus);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigList modifyMayThrow(InterfaceC3845 interfaceC3845, ResolveStatus resolveStatus) {
        ArrayList arrayList = null;
        int i = 0;
        for (AbstractC3843 abstractC3843 : this.value) {
            AbstractC3843 abstractC3843Mo300 = interfaceC3845.mo300(abstractC3843, null);
            if (arrayList == null && abstractC3843Mo300 != abstractC3843) {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(this.value.get(i2));
                }
            }
            if (arrayList != null && abstractC3843Mo300 != null) {
                arrayList.add(abstractC3843Mo300);
            }
            i++;
        }
        return arrayList != null ? resolveStatus != null ? new SimpleConfigList(origin(), arrayList, resolveStatus) : new SimpleConfigList(origin(), arrayList) : this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException(AbstractC0053.m158("ConfigList is immutable, you can't call List.'", str, "'"));
    }

    private static ListIterator<InterfaceC8167> wrapListIterator(ListIterator<AbstractC3843> listIterator) {
        return new C3829(listIterator);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC8167> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean canEqual(Object obj) {
        return obj instanceof SimpleConfigList;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw weAreImmutable("clear");
    }

    public final SimpleConfigList concatenate(SimpleConfigList simpleConfigList) {
        C3838 c3838M8207 = C3838.m8207(origin(), simpleConfigList.origin());
        ArrayList arrayList = new ArrayList(simpleConfigList.value.size() + this.value.size());
        arrayList.addAll(this.value);
        arrayList.addAll(simpleConfigList.value);
        return new SimpleConfigList(c3838M8207, arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.value.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.value.containsAll(collection);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean equals(Object obj) {
        List<AbstractC3843> list;
        List<AbstractC3843> list2;
        return (obj instanceof SimpleConfigList) && canEqual(obj) && ((list = this.value) == (list2 = ((SimpleConfigList) obj).value) || list.equals(list2));
    }

    @Override // java.util.List
    public AbstractC3843 get(int i) {
        return this.value.get(i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public boolean hasDescendant(AbstractC3843 abstractC3843) {
        return AbstractC3843.hasDescendantInList(this.value, abstractC3843);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
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
    public Iterator<InterfaceC8167> iterator() {
        return new C3830(this.value.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.value.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8167> listIterator() {
        return wrapListIterator(this.value.listIterator());
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SimpleConfigList newCopy(InterfaceC8161 interfaceC8161) {
        return new SimpleConfigList(interfaceC8161, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SimpleConfigList relativized(C3858 c3858) {
        return modify(new C3831(c3858), resolveStatus());
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw weAreImmutable("removeAll");
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        if (this.value.isEmpty()) {
            sb.append("[]");
            return;
        }
        sb.append("[");
        boolean z2 = c8168.f22501;
        if (z2) {
            sb.append('\n');
        }
        for (AbstractC3843 abstractC3843 : this.value) {
            if (c8168.f22503) {
                for (String str : abstractC3843.origin().m8210().split("\n")) {
                    AbstractC3843.indent(sb, i + 1, c8168);
                    sb.append('#');
                    if (!str.isEmpty()) {
                        sb.append(' ');
                    }
                    sb.append(str);
                    sb.append("\n");
                }
            }
            if (c8168.f22502) {
                List list = abstractC3843.origin().f12060;
                for (String str2 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                    AbstractC3843.indent(sb, i + 1, c8168);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            int i2 = i + 1;
            AbstractC3843.indent(sb, i2, c8168);
            abstractC3843.render(sb, i2, z, c8168);
            sb.append(",");
            if (z2) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (z2) {
            sb.setLength(sb.length() - 1);
            sb.append('\n');
            AbstractC3843.indent(sb, i, c8168);
        }
        sb.append("]");
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public SimpleConfigList replaceChild(AbstractC3843 abstractC3843, AbstractC3843 abstractC38432) {
        List<AbstractC3843> listReplaceChildInList = AbstractC3843.replaceChildInList(this.value, abstractC3843, abstractC38432);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new SimpleConfigList(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public C3852 resolveSubstitutions(C3847 c3847, C3849 c3849) throws AbstractConfigValue$NotPossibleToResolve {
        if (this.resolved) {
            return new C3852(c3847, this);
        }
        if (c3847.f12070 != null) {
            return new C3852(c3847, this);
        }
        try {
            C0076 c0076 = new C0076(c3847, 21, c3849.m8228(this));
            c3847.f12071.getClass();
            return new C3852((C3847) c0076.f227, modifyMayThrow(c0076, ResolveStatus.RESOLVED));
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
    public List<InterfaceC8167> subList(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3843> it = this.value.subList(i, i2).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.value.toArray();
    }

    @Override // p250.InterfaceC8167
    public List<Object> unwrapped() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3843> it = this.value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().unwrapped());
        }
        return arrayList;
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.LIST;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withOrigin */
    public SimpleConfigList mo8221withOrigin(InterfaceC8161 interfaceC8161) {
        return (SimpleConfigList) super.mo8221withOrigin(interfaceC8161);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC8167> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // java.util.List
    public InterfaceC8167 set(int i, InterfaceC8167 interfaceC8167) {
        throw weAreImmutable("set");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.value.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(InterfaceC8167 interfaceC8167) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public InterfaceC8167 remove(int i) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List
    public void add(int i, InterfaceC8167 interfaceC8167) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8167> listIterator(int i) {
        return wrapListIterator(this.value.listIterator(i));
    }

    public SimpleConfigList(InterfaceC8161 interfaceC8161, List<AbstractC3843> list) {
        this(interfaceC8161, list, ResolveStatus.fromValues(list));
    }
}
