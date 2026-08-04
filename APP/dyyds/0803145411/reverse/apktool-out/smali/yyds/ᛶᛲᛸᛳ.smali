.class public final Lyyds/ᛶᛲᛸᛳ;
.super Lyyds/ᛷᲇᛷᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᲀᛴᛸᛴ;


# direct methods
.method public constructor <init>(JLyyds/ᲀᛴᛸᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lyyds/ᛷᲇᛷᲇ;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lyyds/ᛶᛲᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛴᛸᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛲᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛴᛸᛴ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᛴᛸᛴ;->run()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, Lyyds/ᛷᲇᛷᲇ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛶᛲᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛴᛸᛴ;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
