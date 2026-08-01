.class public final synthetic Lr0/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/view/View$OnCreateContextMenuListener;

.field public final synthetic d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field public final synthetic e:Le0/a;

.field public final synthetic f:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnCreateContextMenuListener;Le0/a;Ljava/io/Serializable;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/Z;->b:I

    iput-object p1, p0, Lr0/Z;->c:Landroid/view/View$OnCreateContextMenuListener;

    iput-object p2, p0, Lr0/Z;->e:Le0/a;

    iput-object p3, p0, Lr0/Z;->f:Ljava/io/Serializable;

    iput-object p4, p0, Lr0/Z;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/Z;->f:Ljava/io/Serializable;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/Z;->e:Le0/a;

    .line 4
    .line 5
    iget-object v2, p0, Lr0/Z;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 6
    .line 7
    iget-object v3, p0, Lr0/Z;->c:Landroid/view/View$OnCreateContextMenuListener;

    .line 8
    .line 9
    iget v4, p0, Lr0/Z;->b:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v3, p1, p2, p3}, Landroid/view/View$OnCreateContextMenuListener;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object p3, Lr0/H0;->g0:Ljava/util/List;

    .line 20
    .line 21
    check-cast v1, Lr0/H0;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v0, v0, p2}, Lr0/H0;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, v0, v0}, Lr0/H0;->o(Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    invoke-interface {v3, p1, p2, p3}, Landroid/view/View$OnCreateContextMenuListener;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 36
    .line 37
    .line 38
    sget-boolean p2, Lz0/i;->a:Z

    .line 39
    .line 40
    invoke-static {}, Lz0/g;->F()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    check-cast v0, LE0/c;

    .line 48
    .line 49
    iget-object p2, v0, LE0/c;->a:Ljava/lang/Object;

    .line 50
    .line 51
    move-object p3, p2

    .line 52
    check-cast p3, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v0, LE0/c;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object v3, Lr0/d0;->U:Ljava/util/List;

    .line 61
    .line 62
    check-cast v1, Lr0/d0;

    .line 63
    .line 64
    invoke-virtual {v1, p3, v0, v2}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast p2, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, p1, p2, v0}, Lr0/d0;->a(Lr0/d0;Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
