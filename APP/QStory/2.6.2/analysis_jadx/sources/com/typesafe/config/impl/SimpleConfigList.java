package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p250.C8167;
import p250.InterfaceC8160;
import p250.InterfaceC8164;
import p250.InterfaceC8166;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigList extends AbstractC3842 implements InterfaceC8164, InterfaceC3860, Serializable {
    private static final long serialVersionUID = 2;
    private final boolean resolved;
    private final List<AbstractC3842> value;

    public SimpleConfigList(InterfaceC8160 interfaceC8160, List<AbstractC3842> list, ResolveStatus resolveStatus) {
        super(interfaceC8160);
        this.value = list;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        if (resolveStatus == ResolveStatus.fromValues(list)) {
            return;
        }
        C2941.m6337(this, "SimpleConfigList created with wrong resolve status: ");
        throw null;
    }

    private SimpleConfigList modify(AbstractC3843 abstractC3843, ResolveStatus resolveStatus) {
        try {
            return modifyMayThrow(abstractC3843, resolveStatus);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigList modifyMayThrow(InterfaceC3844 interfaceC3844, ResolveStatus resolveStatus) {
        ArrayList arrayList = null;
        int i = 0;
        for (AbstractC3842 abstractC3842 : this.value) {
            AbstractC3842 abstractC3842Mo291 = interfaceC3844.mo291(abstractC3842, null);
            if (arrayList == null && abstractC3842Mo291 != abstractC3842) {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(this.value.get(i2));
                }
            }
            if (arrayList != null && abstractC3842Mo291 != null) {
                arrayList.add(abstractC3842Mo291);
            }
            i++;
        }
        return arrayList != null ? resolveStatus != null ? new SimpleConfigList(origin(), arrayList, resolveStatus) : new SimpleConfigList(origin(), arrayList) : this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException(AbstractC0053.m156("ConfigList is immutable, you can't call List.'", str, "'"));
    }

    private static ListIterator<InterfaceC8166> wrapListIterator(ListIterator<AbstractC3842> listIterator) {
        return new C3828(listIterator);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC8166> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public boolean canEqual(Object obj) {
        return obj instanceof SimpleConfigList;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw weAreImmutable("clear");
    }

    public final SimpleConfigList concatenate(SimpleConfigList simpleConfigList) {
        C3837 c3837M8220 = C3837.m8220(origin(), simpleConfigList.origin());
        ArrayList arrayList = new ArrayList(simpleConfigList.value.size() + this.value.size());
        arrayList.addAll(this.value);
        arrayList.addAll(simpleConfigList.value);
        return new SimpleConfigList(c3837M8220, arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.value.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.value.containsAll(collection);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public boolean equals(Object obj) {
        List<AbstractC3842> list;
        List<AbstractC3842> list2;
        return (obj instanceof SimpleConfigList) && canEqual(obj) && ((list = this.value) == (list2 = ((SimpleConfigList) obj).value) || list.equals(list2));
    }

    @Override // java.util.List
    public AbstractC3842 get(int i) {
        return this.value.get(i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public boolean hasDescendant(AbstractC3842 abstractC3842) {
        return AbstractC3842.hasDescendantInList(this.value, abstractC3842);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
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
    public Iterator<InterfaceC8166> iterator() {
        return new C3829(this.value.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.value.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8166> listIterator() {
        return wrapListIterator(this.value.listIterator());
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public SimpleConfigList newCopy(InterfaceC8160 interfaceC8160) {
        return new SimpleConfigList(interfaceC8160, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public SimpleConfigList relativized(C3857 c3857) {
        return modify(new C3830(c3857), resolveStatus());
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw weAreImmutable("removeAll");
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        if (this.value.isEmpty()) {
            sb.append("[]");
            return;
        }
        sb.append("[");
        boolean z2 = c8167.f22503;
        if (z2) {
            sb.append('\n');
        }
        for (AbstractC3842 abstractC3842 : this.value) {
            if (c8167.f22505) {
                for (String str : abstractC3842.origin().m8223().split("\n")) {
                    AbstractC3842.indent(sb, i + 1, c8167);
                    sb.append('#');
                    if (!str.isEmpty()) {
                        sb.append(' ');
                    }
                    sb.append(str);
                    sb.append("\n");
                }
            }
            if (c8167.f22504) {
                List list = abstractC3842.origin().f12055;
                for (String str2 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                    AbstractC3842.indent(sb, i + 1, c8167);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            int i2 = i + 1;
            AbstractC3842.indent(sb, i2, c8167);
            abstractC3842.render(sb, i2, z, c8167);
            sb.append(",");
            if (z2) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (z2) {
            sb.setLength(sb.length() - 1);
            sb.append('\n');
            AbstractC3842.indent(sb, i, c8167);
        }
        sb.append("]");
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public SimpleConfigList replaceChild(AbstractC3842 abstractC3842, AbstractC3842 abstractC38422) {
        List<AbstractC3842> listReplaceChildInList = AbstractC3842.replaceChildInList(this.value, abstractC3842, abstractC38422);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new SimpleConfigList(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public C3851 resolveSubstitutions(C3846 c3846, C3848 c3848) throws AbstractConfigValue$NotPossibleToResolve {
        if (this.resolved) {
            return new C3851(c3846, this);
        }
        if (c3846.f12065 != null) {
            return new C3851(c3846, this);
        }
        try {
            C0076 c0076 = new C0076(c3846, 21, c3848.m8241(this));
            c3846.f12066.getClass();
            return new C3851((C3846) c0076.f227, modifyMayThrow(c0076, ResolveStatus.RESOLVED));
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
    public List<InterfaceC8166> subList(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3842> it = this.value.subList(i, i2).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.value.toArray();
    }

    @Override // p250.InterfaceC8166
    public List<Object> unwrapped() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3842> it = this.value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().unwrapped());
        }
        return arrayList;
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.LIST;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withOrigin */
    public SimpleConfigList mo8234withOrigin(InterfaceC8160 interfaceC8160) {
        return (SimpleConfigList) super.mo8234withOrigin(interfaceC8160);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC8166> collection) {
        throw weAreImmutable("addAll");
    }

    @Override // java.util.List
    public InterfaceC8166 set(int i, InterfaceC8166 interfaceC8166) {
        throw weAreImmutable("set");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.value.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(InterfaceC8166 interfaceC8166) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public InterfaceC8166 remove(int i) {
        throw weAreImmutable("remove");
    }

    @Override // java.util.List
    public void add(int i, InterfaceC8166 interfaceC8166) {
        throw weAreImmutable("add");
    }

    @Override // java.util.List
    public ListIterator<InterfaceC8166> listIterator(int i) {
        return wrapListIterator(this.value.listIterator(i));
    }

    public SimpleConfigList(InterfaceC8160 interfaceC8160, List<AbstractC3842> list) {
        this(interfaceC8160, list, ResolveStatus.fromValues(list));
    }
}
