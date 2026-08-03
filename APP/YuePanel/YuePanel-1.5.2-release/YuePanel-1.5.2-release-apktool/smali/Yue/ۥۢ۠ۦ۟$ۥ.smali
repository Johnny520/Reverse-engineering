.class public LYue/ۥۢ۠ۦ۟$ۥ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۦ۟;->ۥ۟۟۟۠(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢ۠ۦ۟$ۥ۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:F

.field public ۥ۟۟۠ۤ:F

.field public ۥ۟۟۠ۥ:F

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Landroid/view/View;

.field public final synthetic ۥ۟۟۠ۨ:Landroid/view/ViewGroup;

.field public final synthetic ۥ۟۟ۡ:Landroid/view/View;

.field public final synthetic ۥ۟۟ۡ۟:F

.field public final synthetic ۥ۟۟ۡ۠:I

.field public final synthetic ۥ۟۟ۡۡ:LYue/ۥۢ۠ۦ۟$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;FILYue/ۥۢ۠ۦ۟$ۥ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢ۠ۦ۟$ۥ;->ۥ۟۟۠ۨ:Landroid/view/ViewGroup;

    iput-object p2, p0, LYue/ۥۢ۠ۦ۟$ۥ;->ۥ۟۟ۡ:Landroid/view/View;

    iput p3, p0, LYue/ۥۢ۠ۦ۟$ۥ;->ۥ۟۟ۡ۟:F

    iput p4, p0, LYue/ۥۢ۠ۦ۟$ۥ;->ۥ۟۟ۡ۠:I

    iput-object p5, p0, LYue/ۥۢ۠ۦ۟$ۥ;->ۥ۟۟ۡۡ:LYue/ۥۢ۠ۦ۟$ۥ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end method
