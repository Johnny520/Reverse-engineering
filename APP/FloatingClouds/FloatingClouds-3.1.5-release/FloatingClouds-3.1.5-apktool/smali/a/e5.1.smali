.class public final La/e5;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/D7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/D7<",
        "Ljava/lang/String;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:La/e5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/e5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La/u9;-><init>(I)V

    sput-object v0, La/e5;->b:La/e5;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/h5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
