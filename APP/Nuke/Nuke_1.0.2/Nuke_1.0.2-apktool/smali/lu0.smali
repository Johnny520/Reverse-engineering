.class public final synthetic Llu0;
.super Lyn0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic o:Lo72;

.field public final synthetic p:Landroid/view/ViewGroup;

.field public final synthetic q:Ly62;

.field public final synthetic r:Ll80;


# direct methods
.method public constructor <init>(Lo72;Landroid/view/ViewGroup;Ly62;Ll80;)V
    .locals 6

    .line 1
    iput-object p1, p0, Llu0;->o:Lo72;

    .line 2
    .line 3
    iput-object p2, p0, Llu0;->p:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p3, p0, Llu0;->q:Ly62;

    .line 6
    .line 7
    iput-object p4, p0, Llu0;->r:Ll80;

    .line 8
    .line 9
    const-string v4, "showHostComposeDialog$lambda$0$dismiss(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/ViewGroup;Lkotlin/jvm/internal/Ref$BooleanRef;Lnuke/ui/compose/DialogComposeOwner;)V"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const-class v2, Ls11;

    .line 14
    .line 15
    const-string v3, "dismiss"

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    invoke-direct/range {v0 .. v5}, Lyn0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Llu0;->o:Lo72;

    .line 2
    .line 3
    iget-object v1, v0, Lo72;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lix;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Llu0;->p:Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Llu0;->q:Ly62;

    .line 21
    .line 22
    iget-boolean v2, v1, Ly62;->h:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v2, 0x1

    .line 28
    iput-boolean v2, v1, Ly62;->h:Z

    .line 29
    .line 30
    iget-object p0, p0, Llu0;->r:Ll80;

    .line 31
    .line 32
    invoke-virtual {p0}, Ll80;->a()V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    iput-object p0, v0, Lo72;->i:Ljava/lang/Object;

    .line 37
    .line 38
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 39
    .line 40
    return-object p0
.end method
