.class public final La/v6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/v6$a;,
        La/v6$b;,
        La/v6$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/Pd<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:La/w6;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    sget-object v0, La/w6;->a:La/w6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6;->a:Ljava/io/File;

    iput-object v0, p0, La/v6;->b:La/w6;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance v0, La/v6$b;

    invoke-direct {v0, p0}, La/v6$b;-><init>(La/v6;)V

    return-object v0
.end method
