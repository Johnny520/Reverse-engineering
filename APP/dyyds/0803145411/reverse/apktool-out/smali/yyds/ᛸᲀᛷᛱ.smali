.class public abstract Lyyds/ᛸᲀᛷᛱ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛴᛶ;


# instance fields
.field public final ᲇᲇᲇᛱ:I


# direct methods
.method public constructor <init>(ILyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lyyds/ᛶᛴᲀᛲ;-><init>(Lyyds/ᛲᛱᛶᛸ;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛸᲀᛷᛱ;->ᲇᲇᲇᛱ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛱᛴᲈ;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lyyds/ᛷᛱᛴᲈ;->ᛲᲈᲁ(Lyyds/ᛴᛷᛴᛶ;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-super {p0}, Lyyds/ᛲᛴᛷᛳ;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᲀᛷᛱ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    return p0
.end method
