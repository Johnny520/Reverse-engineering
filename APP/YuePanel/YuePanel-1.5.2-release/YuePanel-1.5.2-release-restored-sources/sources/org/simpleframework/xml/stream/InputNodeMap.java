package org.simpleframework.xml.stream;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class InputNodeMap extends LinkedHashMap<String, InputNode> implements NodeMap<InputNode> {
    private final InputNode source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputNodeMap(InputNode inputNode) {
        this.source = inputNode;
    }

    private void build(EventNode eventNode) {
        for (Attribute attribute : eventNode) {
            InputAttribute inputAttribute = new InputAttribute(this.source, attribute);
            if (!attribute.isReserved()) {
                put(inputAttribute.getName(), inputAttribute);
            }
        }
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public String getName() {
        return this.source.getName();
    }

    @Override // org.simpleframework.xml.stream.NodeMap, java.lang.Iterable
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/String;)Lorg/simpleframework/xml/stream/Node; */
    @Override // org.simpleframework.xml.stream.NodeMap
    public InputNode get(String str) {
        return (InputNode) super.get((Object) str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getNode()Lorg/simpleframework/xml/stream/Node; */
    @Override // org.simpleframework.xml.stream.NodeMap
    public InputNode getNode() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/String;Ljava/lang/String;)Lorg/simpleframework/xml/stream/Node; */
    @Override // org.simpleframework.xml.stream.NodeMap
    public InputNode put(String str, String str2) {
        InputAttribute inputAttribute = new InputAttribute(this.source, str, str2);
        if (str != null) {
            put(str, inputAttribute);
        }
        return inputAttribute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/String;)Lorg/simpleframework/xml/stream/Node; */
    @Override // org.simpleframework.xml.stream.NodeMap
    public InputNode remove(String str) {
        return (InputNode) super.remove((Object) str);
    }

    public InputNodeMap(InputNode inputNode, EventNode eventNode) {
        this.source = inputNode;
        build(eventNode);
    }
}
