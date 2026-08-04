.class public final Lyyds/ᛵᲇᛳᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᲇᛱᛷ;


# instance fields
.field public final ᛲᲈᲁ:[Lyyds/ᛲᛲᛶᲁ;


# direct methods
.method public constructor <init>([Lyyds/ᛲᛲᛶᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᲇᛳᛷ;->ᛲᲈᲁ:[Lyyds/ᛲᛲᛶᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DisposeHandlersOnCancel["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛵᲇᛳᛷ;->ᛲᲈᲁ:[Lyyds/ᛲᛲᛶᲁ;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x5d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᲇᛳᛷ;->ᛵᛸᛸᛷ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲇᛳᛷ;->ᛲᲈᲁ:[Lyyds/ᛲᛲᛶᲁ;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v2, v2, Lyyds/ᛲᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᛴᲇᛲᛱ;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_1
    invoke-interface {v2}, Lyyds/ᛴᲇᛲᛱ;->ᛵᛸᛸᛷ()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method
