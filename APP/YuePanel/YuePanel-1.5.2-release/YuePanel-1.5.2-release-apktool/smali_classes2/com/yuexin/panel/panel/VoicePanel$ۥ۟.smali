.class public Lcom/yuexin/panel/panel/VoicePanel$ۥ۟;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuButtonClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuexin/panel/panel/VoicePanel;->configLeftMenu(Landroid/widget/Switch;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kongzue/dialogx/interfaces/OnMenuButtonClickListener<",
        "Lcom/kongzue/dialogx/dialogs/BottomMenu;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Lcom/yuexin/panel/panel/VoicePanel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b3

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lcom/yuexin/panel/panel/VoicePanel;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/yuexin/panel/panel/VoicePanel$ۥ۟;->ۥ:Lcom/yuexin/panel/panel/VoicePanel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge native synthetic onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
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

.method public native ۥ(Lcom/kongzue/dialogx/dialogs/BottomMenu;Landroid/view/View;)Z
.end method
