.class public abstract Lyyds/ᛳᲇᛸᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲁᛸᲀ;


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lyyds/ᛴᛲᛱᛶ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 1

    .line 1
    new-instance p1, Lyyds/ᛲᲁᛴᛳ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛴᛲᛱᛶ;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-direct {p1, v0, p0}, Lyyds/ᛲᲁᛴᛳ;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public ᛲᲈᲁ(Lyyds/ᛷᛲᛴᛳ;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
