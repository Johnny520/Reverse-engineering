.class public LYue/ۥۣ۠ۧۧ$ۥ۟۟;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟:Landroidx/lifecycle/ViewModelProvider$Factory;


# instance fields
.field public ۥ:LYue/ۥۢ۟ۦ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e6\u06e0<",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e7$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣ۠ۧۧ$ۥ۟۟$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟$ۥ;-><init>()V

    sput-object v0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, LYue/ۥۢ۟ۦ۠;

    invoke-direct {v0}, LYue/ۥۢ۟ۦ۠;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟:Z

    return-void
.end method

.method public static ۥ۟۟(Landroidx/lifecycle/ViewModelStore;)LYue/ۥۣ۠ۧۧ$ۥ۟۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    sget-object v1, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟:Landroidx/lifecycle/ViewModelProvider$Factory;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    return-object p0
.end method


# virtual methods
.method public onCleared()V
    .locals 4

    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥۣ۟۟ۡ()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v2, v1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟ۡۤ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣ۠ۧۧ$ۥ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟(Z)LYue/ۥۣ۠ۧۥ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟()V

    return-void
.end method

.method public ۥ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥۣ۟۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v2}, LYue/ۥۢ۟ۦ۠;->ۥۣ۟۟ۡ()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v2, v1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟ۡۤ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣ۠ۧۧ$ۥ;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v3, v1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۠۟(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, LYue/ۥۣ۠ۧۧ$ۥ;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟:Z

    return-void
.end method

.method public ۥ۟۟۟(I)LYue/ۥۣ۠ۧۧ$ۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e7$\u06e5<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟ۤ(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۠ۧۧ$ۥ;

    return-object p1
.end method

.method public ۥ۟۟۟۟()Z
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥۣ۟۟ۡ()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v3, v2}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟ۡۤ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۣ۠ۧۧ$ۥ;

    invoke-virtual {v3}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥۣ۟۟ۡ()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v2, v1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟ۡۤ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣ۠ۧۧ$ۥ;

    invoke-virtual {v2}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۠()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۢ(ILYue/ۥۣ۠ۧۧ$ۥ;)V
    .locals 1
    .param p2    # LYue/ۥۣ۠ۧۧ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۠۠(ILjava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۠ۤ(I)V

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟:Z

    return-void
.end method
