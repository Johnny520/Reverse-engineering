.class public final Lyyds/ᲁᲁᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲇᛷ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᲁᲁᲇᛷ;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᲁᲁᲇᛷ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲁᲁᲇᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᲁᲁᲇᛷ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᲁᲁᲇᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᲁᲁᲇᛷ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᲁᲁᲇᛷ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᲁᲁᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲁᲇᛷ;

    .line 16
    .line 17
    new-instance v0, Lyyds/ᲁᲁᲇᛷ;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lyyds/ᲁᲁᲇᛷ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lyyds/ᲁᲁᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 24
    .line 25
    new-instance v0, Lyyds/ᲁᲁᲇᛷ;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lyyds/ᲁᲁᲇᛷ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lyyds/ᲁᲁᲇᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᲁᲇᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᲁᲇᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    return p0

    .line 13
    :pswitch_0
    const/4 p0, 0x3

    .line 14
    if-eq p1, p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x5

    .line 17
    if-eq p1, p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    :goto_1
    return p0

    .line 23
    :pswitch_1
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :pswitch_2
    const/4 p0, 0x2

    .line 26
    if-ne p1, p0, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    :goto_2
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
