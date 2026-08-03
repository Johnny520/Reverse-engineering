.class public final synthetic LYue/ۥ۠ۢ۠۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnInputDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۢۡۢ;

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(LYue/ۥ۠ۢۡۢ;ILorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢ۠۟;->ۥ:LYue/ۥ۠ۢۡۢ;

    iput p2, p0, LYue/ۥ۠ۢ۠۟;->ۥ۟:I

    iput-object p3, p0, LYue/ۥ۠ۢ۠۟;->ۥ۟۟:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, LYue/ۥ۠ۢ۠۟;->ۥ:LYue/ۥ۠ۢۡۢ;

    iget v1, p0, LYue/ۥ۠ۢ۠۟;->ۥ۟:I

    iget-object v2, p0, LYue/ۥ۠ۢ۠۟;->ۥ۟۟:Lorg/json/JSONObject;

    move-object v3, p1

    check-cast v3, Lcom/kongzue/dialogx/dialogs/InputDialog;

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LYue/ۥ۠ۢۡۢ;->ۥ۟۟۟ۦ(LYue/ۥ۠ۢۡۢ;ILorg/json/JSONObject;Lcom/kongzue/dialogx/dialogs/InputDialog;Landroid/view/View;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
