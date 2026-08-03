.class public final La/A4$a;
.super La/A4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:La/A4$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/A4$a;

    invoke-direct {v0}, La/A4;-><init>()V

    sput-object v0, La/A4$a;->b:La/A4$a;

    return-void
.end method
