package org.simpleframework.xml.strategy;

import org.simpleframework.xml.util.WeakCache;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class WriteState extends WeakCache<WriteGraph> {
    private Contract contract;

    public WriteState(Contract contract) {
        this.contract = contract;
    }

    public WriteGraph find(Object obj) {
        WriteGraph writeGraphFetch = fetch(obj);
        if (writeGraphFetch != null) {
            return writeGraphFetch;
        }
        WriteGraph writeGraph = new WriteGraph(this.contract);
        cache(obj, writeGraph);
        return writeGraph;
    }
}
