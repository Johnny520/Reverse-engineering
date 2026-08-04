.class interface abstract Lorg/simpleframework/xml/core/Instantiator;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public abstract getCreators()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/simpleframework/xml/core/Creator;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getInstance()Ljava/lang/Object;
.end method

.method public abstract getInstance(Lorg/simpleframework/xml/core/Criteria;)Ljava/lang/Object;
.end method

.method public abstract getParameter(Ljava/lang/String;)Lorg/simpleframework/xml/core/Parameter;
.end method

.method public abstract getParameters()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/simpleframework/xml/core/Parameter;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isDefault()Z
.end method
