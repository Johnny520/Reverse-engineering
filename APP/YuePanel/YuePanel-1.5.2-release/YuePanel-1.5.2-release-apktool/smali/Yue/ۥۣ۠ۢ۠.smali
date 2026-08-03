.class public final synthetic LYue/ۥۣ۠ۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۢ۠;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣ۠ۢ۠;->ۥ۟:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۢ۠;->ۥ:Ljava/lang/String;

    iget-object v1, p0, LYue/ۥۣ۠ۢ۠;->ۥ۟:Lorg/json/JSONObject;

    check-cast p1, Lcom/kongzue/dialogx/dialogs/MessageDialog;

    invoke-static {v0, v1, p1, p2}, LYue/ۥ۠ۢۡۢ;->ۥ(Ljava/lang/String;Lorg/json/JSONObject;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
