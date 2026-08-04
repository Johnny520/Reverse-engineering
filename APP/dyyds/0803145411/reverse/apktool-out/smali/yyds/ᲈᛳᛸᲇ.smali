.class public final Lyyds/ᲈᛳᛸᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᲀᛶᛸ;


# instance fields
.field public final ᲀᛲᛳᲀ:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

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
    const-string v1, "Empty{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-string p0, "Active"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "New"

    .line 16
    .line 17
    :goto_0
    const/16 v1, 0x7d

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final ᛲᲈᲁ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛷᛳᲁᲈ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
