.class public final synthetic La/Td;
.super La/S7;
.source "SourceFile"

# interfaces
.implements La/D7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/S7;",
        "La/D7<",
        "La/Pd<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final i:La/Td;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, La/Td;

    sget-object v2, La/E2$a;->a:La/E2$a;

    const-class v3, La/Pd;

    const-string v4, "iterator"

    const/4 v1, 0x1

    const-string v5, "iterator()Ljava/util/Iterator;"

    invoke-direct/range {v0 .. v5}, La/R7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, La/Td;->i:La/Td;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, La/Pd;

    const-string v0, "p0"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, La/Pd;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
