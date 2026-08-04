.class public final Lyyds/ᲀᛸᛵᲈ;
.super Lyyds/ᛳᛷᛶᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛷᲇ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲇᛷᲇ;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lyyds/ᛵᲇᛷᲇ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᲀᛸᛵᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛷᲇ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()Ljava/util/Random;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᛵᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛷᲇ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Random;

    .line 8
    .line 9
    return-object p0
.end method
