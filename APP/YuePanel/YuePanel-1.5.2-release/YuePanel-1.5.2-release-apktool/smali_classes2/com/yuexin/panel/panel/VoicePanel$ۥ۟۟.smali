.class public Lcom/yuexin/panel/panel/VoicePanel$ۥ۟۟;
.super Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;


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
        "Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener<",
        "Lcom/kongzue/dialogx/dialogs/BottomMenu;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Lcom/yuexin/panel/panel/VoicePanel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x329

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

    iput-object p1, p0, Lcom/yuexin/panel/panel/VoicePanel$ۥ۟۟;->ۥ:Lcom/yuexin/panel/panel/VoicePanel;

    invoke-direct {p0}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge native synthetic onMultiItemSelect(Ljava/lang/Object;[Ljava/lang/CharSequence;[I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation
.end method

.method public native ۥ(Lcom/kongzue/dialogx/dialogs/BottomMenu;[Ljava/lang/CharSequence;[I)V
.end method
