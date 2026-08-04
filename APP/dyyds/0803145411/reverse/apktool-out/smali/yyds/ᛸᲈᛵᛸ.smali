.class public final synthetic Lyyds/ᛸᲈᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᛲᲀᛷ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lyyds/ᛸᲈᛵᛸ;->ᲀᛲᛳᲀ:I

    iput-object p2, p0, Lyyds/ᛸᲈᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲁᛶᛶᛸ;Lyyds/ᛸᛱᛳᛴ;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lyyds/ᛸᲈᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛸᲈᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᲈᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛸᲈᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lyyds/ᛸᛵᛶᲀ;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Throwable;

    .line 13
    .line 14
    check-cast p2, Lyyds/ᲈᲀᛸᲀ;

    .line 15
    .line 16
    check-cast p3, Lyyds/ᲁᛴᛲ;

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛸᛵᛶᲀ;->ᲀᛲᛳᲀ()V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p0, Lyyds/ᲁᛶᛶᛸ;

    .line 23
    .line 24
    check-cast p1, Ljava/lang/Throwable;

    .line 25
    .line 26
    check-cast p2, Lyyds/ᲈᲀᛸᲀ;

    .line 27
    .line 28
    check-cast p3, Lyyds/ᲁᛴᛲ;

    .line 29
    .line 30
    sget-object p1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lyyds/ᲁᛶᛶᛸ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_1
    check-cast p0, Lyyds/ᲈᛷᲈᛶ;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/Throwable;

    .line 43
    .line 44
    check-cast p3, Lyyds/ᲁᛴᛲ;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lyyds/ᲈᛷᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
