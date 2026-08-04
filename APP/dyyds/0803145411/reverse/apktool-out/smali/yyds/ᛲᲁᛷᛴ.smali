.class public final Lyyds/ᛲᲁᛷᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᛱᛴ;
.implements Lyyds/ᲁᛸᛲᲁ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛷᛴ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛲᲁᛷᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᲁᛷᛴ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᛷᛴ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛲᲁᛷᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲁᛷᛴ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛲᲁᛷᛴ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᛷᛴ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛲᲁᛷᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛷᛴ;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getKey()Lyyds/ᲁᛸᛲᲁ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    sget-object p0, Lyyds/ᛲᲁᛷᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲁᛷᛴ;

    .line 8
    .line 9
    return-object p0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᛱᲈᲁ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᛱᲈᲁ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p1, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p1, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
