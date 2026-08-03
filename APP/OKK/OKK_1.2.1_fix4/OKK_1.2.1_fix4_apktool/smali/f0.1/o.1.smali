.class public final synthetic Lf0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LP0/a;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;LP0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf0/o;->a:Z

    iput-object p2, p0, Lf0/o;->b:Ljava/lang/String;

    iput-object p3, p0, Lf0/o;->c:LP0/a;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    const-string p1, "$key"

    iget-object v0, p0, Lf0/o;->b:Ljava/lang/String;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lf0/o;->a:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lc0/h1;->a:Lc0/h1;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p2, v1}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    iget-object p1, p0, Lf0/o;->c:LP0/a;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LP0/a;->invoke()Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method
