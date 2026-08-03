.class public LYue/ۥ۟۠ۧ$ۥ۟۟;
.super Landroid/view/animation/Animation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۠ۧ;->ۥ۟(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/view/View;

.field public final synthetic ۥ۟۟۠ۤ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x232

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟۠ۧ$ۥ۟۟;->ۥۣ۟۟۠:Landroid/view/View;

    iput p2, p0, LYue/ۥ۟۠ۧ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public native applyTransformation(FLandroid/view/animation/Transformation;)V
.end method
