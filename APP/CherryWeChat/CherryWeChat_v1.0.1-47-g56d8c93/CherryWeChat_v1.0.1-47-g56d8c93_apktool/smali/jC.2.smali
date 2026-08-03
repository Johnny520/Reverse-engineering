.class public final LjC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LjC;

.field public static final b:Lpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LjC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LjC;->a:LjC;

    const-string v0, "kotlin.UInt"

    sget-object v1, LHl;->a:LHl;

    invoke-static {v1, v0}, LDc;->a(LQm;Ljava/lang/String;)Lpl;

    move-result-object v0

    sput-object v0, LjC;->b:Lpl;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    sget-object v0, LjC;->b:Lpl;

    invoke-interface {p1, v0}, LJc;->u(LCx;)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->p()I

    move-result p1

    new-instance v0, LfC;

    invoke-direct {v0, p1}, LfC;-><init>(I)V

    return-object v0
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LjC;->b:Lpl;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LfC;

    iget p1, p2, LfC;->a:I

    const/4 p1, 0x0

    throw p1
.end method
