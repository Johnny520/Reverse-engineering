.class public final Lio/github/cherrywechat/ui/MaterialSwitch;
.super LYz;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-wide v0, -0x2d8bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1, p2}, LYz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lio/github/cherrywechat/ui/MaterialSwitch;->getThumbColor()J

    move-result-wide p1

    long-to-int p1, p1

    invoke-direct {p0}, Lio/github/cherrywechat/ui/MaterialSwitch;->getThumbColor()J

    move-result-wide v0

    long-to-int p2, v0

    const v0, -0x9a9a9b

    filled-new-array {v0, p1, p2}, [I

    move-result-object p1

    const p2, 0x10100a0

    filled-new-array {p2}, [I

    move-result-object p2

    const v0, 0x10100a7

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [I

    filled-new-array {p2, v0, v1}, [[I

    move-result-object p2

    new-instance v0, Landroid/content/res/ColorStateList;

    invoke-direct {v0, p2, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {p0, v0}, LYz;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    return-void
.end method

.method private final getThumbColor()J
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x2c745fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, LGu;->u(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, 0xff7c7c7cL

    return-wide v0

    :cond_0
    const-wide v0, 0xffccccccL

    return-wide v0
.end method
