.class public final synthetic Lr0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Lr0/d0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/N;->a:Lr0/d0;

    iput-object p2, p0, Lr0/N;->b:Ljava/lang/String;

    iput-object p3, p0, Lr0/N;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean p1, Lz0/i;->a:Z

    .line 7
    .line 8
    invoke-static {}, Lz0/g;->F()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lr0/N;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lr0/N;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lr0/N;->a:Lr0/d0;

    .line 20
    .line 21
    invoke-virtual {v1, p1, v0}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method
