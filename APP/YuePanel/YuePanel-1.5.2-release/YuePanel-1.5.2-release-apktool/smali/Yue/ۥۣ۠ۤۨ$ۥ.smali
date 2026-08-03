.class public LYue/ۥۣ۠ۤۨ$ۥ;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۤۨ;->ۥ۟۟۠ۨ(Landroid/content/Context;Ljava/lang/Object;Ljava/io/File;LYue/ۥۣ۠ۤۨ$ۥ۟۟;LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2c8

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۠ۤۨ$ۥ;->ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public native onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
.end method
