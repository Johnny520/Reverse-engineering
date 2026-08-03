.class public final synthetic LYue/ۥ۟ۤۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuButtonClickListener;


# instance fields
.field public final synthetic ۥ:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۧۨ;->ۥ:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۧۨ;->ۥ:[Ljava/lang/String;

    check-cast p1, Lcom/kongzue/dialogx/dialogs/BottomMenu;

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟([Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/BottomMenu;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
