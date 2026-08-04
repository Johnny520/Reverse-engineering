package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ModelSection implements Section {
    private LabelMap attributes;
    private LabelMap elements;
    private Model model;
    private ModelMap models;

    public ModelSection(Model model) {
        this.model = model;
    }

    @Override // org.simpleframework.xml.core.Section
    public String getAttribute(String str) {
        Expression expression = this.model.getExpression();
        return expression == null ? str : expression.getAttribute(str);
    }

    @Override // org.simpleframework.xml.core.Section
    public LabelMap getAttributes() {
        LabelMap labelMap = this.attributes;
        if (labelMap != null) {
            return labelMap;
        }
        LabelMap attributes = this.model.getAttributes();
        this.attributes = attributes;
        return attributes;
    }

    @Override // org.simpleframework.xml.core.Section
    public Label getElement(String str) {
        return getElements().getLabel(str);
    }

    @Override // org.simpleframework.xml.core.Section
    public LabelMap getElements() {
        LabelMap labelMap = this.elements;
        if (labelMap != null) {
            return labelMap;
        }
        LabelMap elements = this.model.getElements();
        this.elements = elements;
        return elements;
    }

    public ModelMap getModels() {
        ModelMap modelMap = this.models;
        if (modelMap != null) {
            return modelMap;
        }
        ModelMap models = this.model.getModels();
        this.models = models;
        return models;
    }

    @Override // org.simpleframework.xml.core.Section
    public String getName() {
        return this.model.getName();
    }

    @Override // org.simpleframework.xml.core.Section
    public String getPath(String str) {
        Expression expression = this.model.getExpression();
        return expression == null ? str : expression.getElement(str);
    }

    @Override // org.simpleframework.xml.core.Section
    public String getPrefix() {
        return this.model.getPrefix();
    }

    @Override // org.simpleframework.xml.core.Section
    public Section getSection(String str) {
        Model modelTake;
        ModelList modelList = getModels().get(str);
        if (modelList == null || (modelTake = modelList.take()) == null) {
            return null;
        }
        return new ModelSection(modelTake);
    }

    @Override // org.simpleframework.xml.core.Section
    public Label getText() {
        return this.model.getText();
    }

    @Override // org.simpleframework.xml.core.Section
    public boolean isSection(String str) {
        return getModels().get(str) != null;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.model.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList.iterator();
    }
}
