.class public interface abstract annotation Lcom/alibaba/fastjson2/annotation/JSONType;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/alibaba/fastjson2/annotation/JSONType;
        alphabetic = true
        autoTypeBeforeHandler = Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
        builder = V
        deserializeFeatures = {}
        deserializer = Ljava/lang/Void;
        disableArrayMapping = false
        disableAutoType = false
        disableJSONB = false
        disableReferenceDetect = false
        disableSmartMatch = false
        format = ""
        ignores = {}
        includes = {}
        locale = ""
        naming = .enum Lcom/alibaba/fastjson2/PropertyNamingStrategy;->NeverUseThisValueExceptDefaultValue:Lcom/alibaba/fastjson2/PropertyNamingStrategy;
        orders = {}
        rootName = ""
        schema = ""
        seeAlso = {}
        seeAlsoDefault = Ljava/lang/Void;
        serializeFeatures = {}
        serializeFilters = {}
        serializer = Ljava/lang/Void;
        typeKey = ""
        typeName = ""
        writeEnumAsJavaBean = false
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract alphabetic()Z
.end method

.method public abstract autoTypeBeforeHandler()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;",
            ">;"
        }
    .end annotation
.end method

.method public abstract builder()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract deserializeFeatures()[Lcom/alibaba/fastjson2/JSONReader$Feature;
.end method

.method public abstract deserializer()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract disableArrayMapping()Z
.end method

.method public abstract disableAutoType()Z
.end method

.method public abstract disableJSONB()Z
.end method

.method public abstract disableReferenceDetect()Z
.end method

.method public abstract disableSmartMatch()Z
.end method

.method public abstract format()Ljava/lang/String;
.end method

.method public abstract ignores()[Ljava/lang/String;
.end method

.method public abstract includes()[Ljava/lang/String;
.end method

.method public abstract locale()Ljava/lang/String;
.end method

.method public abstract naming()Lcom/alibaba/fastjson2/PropertyNamingStrategy;
.end method

.method public abstract orders()[Ljava/lang/String;
.end method

.method public abstract rootName()Ljava/lang/String;
.end method

.method public abstract schema()Ljava/lang/String;
.end method

.method public abstract seeAlso()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract seeAlsoDefault()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract serializeFeatures()[Lcom/alibaba/fastjson2/JSONWriter$Feature;
.end method

.method public abstract serializeFilters()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "+",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            ">;"
        }
    .end annotation
.end method

.method public abstract serializer()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract typeKey()Ljava/lang/String;
.end method

.method public abstract typeName()Ljava/lang/String;
.end method

.method public abstract writeEnumAsJavaBean()Z
.end method
