.class public final synthetic Lr0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field public final synthetic b:Landroid/view/View$OnCreateContextMenuListener;

.field public final synthetic c:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnCreateContextMenuListener;Lr0/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/X;->b:Landroid/view/View$OnCreateContextMenuListener;

    iput-object p2, p0, Lr0/X;->c:Lr0/d0;

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/X;->b:Landroid/view/View$OnCreateContextMenuListener;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Landroid/view/View$OnCreateContextMenuListener;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Lz0/i;->a:Z

    .line 7
    .line 8
    invoke-static {}, Lz0/g;->F()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    instance-of v1, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p3, 0x0

    .line 23
    :goto_0
    if-eqz p3, :cond_2

    .line 24
    .line 25
    iget p3, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p3, -0x1

    .line 29
    :goto_1
    invoke-static {p2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lr0/d0;->U:Ljava/util/List;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iget-object v2, p0, Lr0/X;->c:Lr0/d0;

    .line 36
    .line 37
    invoke-virtual {v2, p2, p3, v0, v1}, Lr0/d0;->S0(Landroid/view/View;ILjava/lang/Object;Z)LE0/c;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-nez p2, :cond_3

    .line 42
    .line 43
    :goto_2
    return-void

    .line 44
    :cond_3
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p3, p2, LE0/c;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p3, Ljava/lang/String;

    .line 50
    .line 51
    iget-object p2, p2, LE0/c;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2, p1, p3, p2}, Lr0/d0;->a(Lr0/d0;Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
