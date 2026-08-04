package yyds;

import com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: yyds.ᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1906 implements Converter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f9643;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Persister f9644;

    public C1906(Persister persister, Class cls) {
        this.f9644 = persister;
        this.f9643 = cls;
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final Object read(InputNode inputNode) throws IllegalAccessException, InvocationTargetException {
        HashMap mapM3688 = m3688();
        Class cls = this.f9643;
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) cls.newInstance();
        List<Element> any = entityWithAnyElement.getAny();
        while (true) {
            InputNode next = inputNode.getNext();
            if (next == null) {
                return entityWithAnyElement;
            }
            if (mapM3688.containsKey(next.getName())) {
                Field field = (Field) mapM3688.get(next.getName());
                String name = field.getName();
                cls.getMethod("set".concat(name.substring(0, 1).toUpperCase() + name.substring(1)), field.getType()).invoke(entityWithAnyElement, this.f9644.read((Class) field.getType(), next));
            } else if (next.getPrefix() == null || next.getPrefix().isEmpty()) {
                while (next.getNext() != null) {
                }
            } else {
                any.add(AbstractC0578.m1449(next));
            }
        }
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final void write(OutputNode outputNode, Object obj) throws IllegalAccessException, InvocationTargetException {
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) obj;
        for (Element element : entityWithAnyElement.getAny()) {
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
        HashMap mapM3688 = m3688();
        for (String str : mapM3688.keySet()) {
            String name = ((Field) mapM3688.get(str)).getName();
            Object objInvoke = this.f9643.getMethod("get".concat(name.substring(0, 1).toUpperCase() + name.substring(1)), null).invoke(entityWithAnyElement, null);
            if (objInvoke != null) {
                if (objInvoke instanceof String) {
                    OutputNode child2 = outputNode.getChild(str);
                    child2.setReference("DAV:");
                    child2.setValue((String) objInvoke);
                } else {
                    this.f9644.write(objInvoke, outputNode);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final HashMap m3688() {
        HashMap map = new HashMap();
        for (Field field : this.f9643.getDeclaredFields()) {
            org.simpleframework.xml.Element element = (org.simpleframework.xml.Element) field.getAnnotation(org.simpleframework.xml.Element.class);
            if (element != null) {
                map.put(element.name().equals("") ? field.getName() : element.name(), field);
            }
        }
        return map;
    }
}
