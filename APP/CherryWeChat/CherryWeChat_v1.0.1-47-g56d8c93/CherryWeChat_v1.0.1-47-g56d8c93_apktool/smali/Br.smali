.class public final LBr;
.super LGo;
.source ""

# interfaces
.implements Lpr;


# static fields
.field public static final D:Ljava/lang/reflect/Method;


# instance fields
.field public C:LD2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LBr;->D:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public final e(Llr;Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, LBr;->C:LD2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LD2;->e(Llr;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public final i(Llr;Lqr;)V
    .locals 1

    iget-object v0, p0, LBr;->C:LD2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LD2;->i(Llr;Lqr;)V

    :cond_0
    return-void
.end method

.method public final q(Landroid/content/Context;Z)LIe;
    .locals 1

    new-instance v0, LAr;

    invoke-direct {v0, p1, p2}, LAr;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p0}, LAr;->setHoverListener(Lpr;)V

    return-object v0
.end method
