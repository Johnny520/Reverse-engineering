.class public final Lyyds/ᛸᛳᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛷ;


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᛸᛳᛶ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛸᛳᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛸᛳᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛸᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛳᛶ;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛸᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 9
    .line 10
    new-instance p0, Lyyds/ᛵᲁᛴᛱ;

    .line 11
    .line 12
    new-instance p2, Lyyds/ᛸᛷᛴᲁ;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p3, Lyyds/ᲁᛴᲇᲀ;

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    invoke-direct {p3, p4, p1}, Lyyds/ᲁᛴᲇᲀ;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    new-instance p0, Lyyds/ᛵᲁᛴᛱ;

    .line 28
    .line 29
    new-instance p2, Lyyds/ᛸᛷᛴᲁ;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p3, Lyyds/ᲁᛴᲇᲀ;

    .line 35
    .line 36
    const/4 p4, 0x1

    .line 37
    invoke-direct {p3, p4, p1}, Lyyds/ᲁᛴᲇᲀ;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p2, p3}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :pswitch_1
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
