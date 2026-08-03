.class public final Landroidx/transition/h$a;
.super Landroidx/transition/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/h;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/transition/e;


# direct methods
.method public constructor <init>(Landroidx/transition/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/transition/h$a;->a:Landroidx/transition/e;

    return-void
.end method


# virtual methods
.method public final f(Landroidx/transition/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/h$a;->a:Landroidx/transition/e;

    invoke-virtual {v0}, Landroidx/transition/e;->A()V

    invoke-virtual {p1, p0}, Landroidx/transition/e;->y(Landroidx/transition/e$f;)Landroidx/transition/e;

    return-void
.end method
