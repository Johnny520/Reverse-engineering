.class public final Landroidx/lifecycle/E;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/l;


# static fields
.field public static final a:Landroidx/lifecycle/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/E;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LQ0/h;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/E;->a:Landroidx/lifecycle/E;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LQ/b;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/I;

    invoke-direct {p1}, Landroidx/lifecycle/I;-><init>()V

    return-object p1
.end method
