.class public final synthetic Lh/Hchat/crash/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Application;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lh/Hchat/crash/b;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lh/Hchat/crash/b;->h:Landroid/app/Application;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/crash/b;->h:Landroid/app/Application;

    .line 2
    .line 3
    check-cast p1, Landroid/app/ApplicationExitInfo;

    .line 4
    .line 5
    iget v1, p0, Lh/Hchat/crash/b;->g:I

    .line 6
    .line 7
    invoke-static {v1, v0, p1}, Lh/Hchat/crash/CrashExitInfoApi30;->a(ILandroid/app/Application;Landroid/app/ApplicationExitInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
