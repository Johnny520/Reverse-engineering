package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class Signature implements Iterable<Parameter> {
    private final Constructor factory;
    private final ParameterMap parameters;
    private final Class type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Signature(Signature signature) {
        this(signature.factory, signature.type);
    }

    public void add(Parameter parameter) {
        Object key = parameter.getKey();
        if (key != null) {
            this.parameters.put(key, parameter);
        }
    }

    public boolean contains(Object obj) {
        return this.parameters.containsKey(obj);
    }

    public Signature copy() throws Exception {
        Signature signature = new Signature(this);
        Iterator<Parameter> it = iterator();
        while (it.hasNext()) {
            signature.add(it.next());
        }
        return signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object create() throws Exception {
        if (!this.factory.isAccessible()) {
            this.factory.setAccessible(true);
        }
        return this.factory.newInstance(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Parameter get(int i) {
        return this.parameters.get(i);
    }

    public List<Parameter> getAll() {
        return this.parameters.getAll();
    }

    public Class getType() {
        return this.type;
    }

    public boolean isEmpty() {
        return this.parameters.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Parameter> iterator() {
        return this.parameters.iterator();
    }

    public Parameter remove(Object obj) {
        return this.parameters.remove(obj);
    }

    public void set(Object obj, Parameter parameter) {
        this.parameters.put(obj, parameter);
    }

    public int size() {
        return this.parameters.size();
    }

    public String toString() {
        return this.factory.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Signature(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Parameter get(Object obj) {
        return this.parameters.get(obj);
    }

    public Signature(Constructor constructor, Class cls) {
        this.parameters = new ParameterMap();
        this.factory = constructor;
        this.type = cls;
    }

    public Object create(Object[] objArr) throws Exception {
        if (!this.factory.isAccessible()) {
            this.factory.setAccessible(true);
        }
        return this.factory.newInstance(objArr);
    }
}
