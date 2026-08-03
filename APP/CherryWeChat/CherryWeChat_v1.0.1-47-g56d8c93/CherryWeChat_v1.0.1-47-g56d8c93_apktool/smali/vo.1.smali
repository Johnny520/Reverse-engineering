.class public abstract Lvo;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lto;

.field public static final b:Luo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lto;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvo;->a:Lto;

    new-instance v0, Luo;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvo;->b:Luo;

    return-void
.end method


# virtual methods
.method public abstract a(JLjava/lang/Object;)V
.end method

.method public abstract b(JLjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract c(JLjava/lang/Object;)Ljava/util/List;
.end method
