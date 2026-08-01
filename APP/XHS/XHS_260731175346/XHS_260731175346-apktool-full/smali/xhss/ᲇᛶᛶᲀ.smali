.class public final synthetic Lxhss/ᲇᛶᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲇᛱᲈᛸ;Lxhss/ᛷᛱᛳᲁ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxhss/ᲇᛶᛶᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲇᛶᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᛶᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛶᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v0, -0x121b41b858845L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lxhss/ᲇᛱᲈᛸ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛱᛳᲁ;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    const-wide v0, -0x121ae1b858845L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1}, Lxhss/ᲇᛱᲈᛸ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛱᛳᲁ;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
