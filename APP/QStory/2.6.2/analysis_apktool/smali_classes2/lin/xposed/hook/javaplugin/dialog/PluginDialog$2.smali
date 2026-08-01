.class Llin/xposed/hook/javaplugin/dialog/PluginDialog$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/dialog/PluginDialog;->setupPluginList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$2;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$2;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪苏哲兰世(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
