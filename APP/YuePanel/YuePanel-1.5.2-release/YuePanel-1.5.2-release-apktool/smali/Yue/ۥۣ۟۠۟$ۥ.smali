.class public LYue/ۥۣ۟۠۟$ۥ;
.super Lcom/kongzue/dialogx/interfaces/OnBindView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۠۟;->ۥ۟۟۠ۡ(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kongzue/dialogx/interfaces/OnBindView<",
        "Lcom/kongzue/dialogx/dialogs/BottomDialog;",
        ">;"
    }
.end annotation


# static fields
.field public static volatile synthetic ۥ۟:Ljava/lang/String;


# instance fields
.field public final synthetic ۥ:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x294

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/webkit/WebView;)V
    .locals 0

    iput-object p2, p0, LYue/ۥۣ۟۠۟$ۥ;->ۥ:Landroid/webkit/WebView;

    invoke-direct {p0, p1}, Lcom/kongzue/dialogx/interfaces/OnBindView;-><init>(Landroid/view/View;)V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public bridge native synthetic onBind(Ljava/lang/Object;Landroid/view/View;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public native ۥ(Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/view/View;)V
.end method
