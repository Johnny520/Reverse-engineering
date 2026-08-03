.class public final synthetic LYue/ۥۣۡۧۤ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/content/Context;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x205

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/widget/LinearLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧۤ;->ۥۣ۟۟۠:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥۣۡۧۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۣۡۧۤ;->ۥ۟۟۠ۥ:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
