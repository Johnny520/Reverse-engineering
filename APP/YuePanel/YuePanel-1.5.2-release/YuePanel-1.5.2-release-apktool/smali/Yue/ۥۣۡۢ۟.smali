.class public final synthetic LYue/ۥۣۡۢ۟;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x34e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۢ۟;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣۡۢ۟;->ۥ۟:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final native onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z
.end method
