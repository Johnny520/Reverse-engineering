.class public final synthetic Le/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/j;


# instance fields
.field public final synthetic b:Le/w;


# direct methods
.method public synthetic constructor <init>(Le/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/v;->b:Le/w;

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/v;->b:Le/w;

    invoke-virtual {v0, p1}, Le/w;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
