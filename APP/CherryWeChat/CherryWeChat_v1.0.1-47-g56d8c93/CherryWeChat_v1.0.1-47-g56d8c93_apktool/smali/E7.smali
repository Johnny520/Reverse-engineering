.class public final LE7;
.super LZk;
.source ""


# static fields
.field public static final b:LE7;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LE7;

    new-instance v1, Lvx;

    const-wide v2, -0xfadcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xfaf4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xfaf5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xfafcfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x10

    invoke-direct/range {v1 .. v7}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;I)V

    new-instance v2, LZz;

    const-wide v3, -0xfa8bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xfa90fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xfaa6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xfaacfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x40

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LE7;->b:LE7;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    new-instance v0, Lb;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lb;-><init>(I)V

    const-wide v1, -0x20f1afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x20f21fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x20f7efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Lqs;

    const/16 v2, 0xb

    const-class v3, Landroid/widget/EditText;

    invoke-direct {v1, v2, v3}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v1, v0}, Lqs;->f(Lfj;)V

    new-instance v0, LiG;

    const-class v1, Landroid/widget/TextView;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v1, -0xf952fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    const-class v1, Ljava/lang/CharSequence;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->g([Ljava/lang/Object;)V

    new-instance v1, Lb;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lb;-><init>(I)V

    invoke-virtual {v0, v1}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xfabefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
