.class public final La/B6$b;
.super La/B6$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/B6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:La/B6$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/B6$b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/B6$b;->a:La/B6$b;

    return-void
.end method
