.class public final synthetic LYue/ۥ۠ۥۤۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۤۧۧ;


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۥۤۧ;->ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۥۤۧ;->ۥ:Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
