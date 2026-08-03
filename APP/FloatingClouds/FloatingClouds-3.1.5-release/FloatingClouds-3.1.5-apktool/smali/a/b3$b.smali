.class public final La/b3$b;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/D7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/b3;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/D7<",
        "La/b3;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:La/b3$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/b3$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La/u9;-><init>(I)V

    sput-object v0, La/b3$b;->b:La/b3$b;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, La/b3;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La/b3;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
